package com.tanist.time.test;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DelComments {
	public static void main(String[] args) throws Exception {
		String fileName = "E:\\quartz-2.2.1\\quartz-examples-2.2.1.src";
		File f = new File(fileName);
		System.out.println("�ļ����ڴ����У�����رգ�");
		print(f);
		System.out.println("������ɣ�");

	}

	/**
	 * ɾ����jd-gui�������Ĵ����е�ע�ͣ�
	 * 
	 * @param f
	 * @throws Exception
	 */
	public static void print(File f) throws Exception {

		if (f != null) {
			if (f.isDirectory()) {
				String st2 = f.toString().replace("E:\\", "D:\\");
				File fc = new File(st2);
				fc.mkdirs();
				File[] fileArray = f.listFiles();
				if (fileArray != null) {
					for (int i = 0; i < fileArray.length; i++) {
						// �ݹ����
						print(fileArray[i]);
					}
				}
			} else {
				if (f.getName().endsWith(".java")) {
					String stfile = f.toString().replace("E:\\", "D:\\");

					FileOutputStream fileOutputStream = new FileOutputStream(
							stfile);
					OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
							fileOutputStream, "UTF-8");
					BufferedWriter bw = new BufferedWriter(outputStreamWriter);

					FileInputStream fileInputStream = new FileInputStream(f);
					InputStreamReader inputStreamReader = new InputStreamReader(
							fileInputStream, "UTF-8");
					BufferedReader reader = new BufferedReader(
							inputStreamReader);
					String tmp = null;
					StringBuilder strBuilder = new StringBuilder();
					String line = System.getProperty("line.separator");
					while ((tmp = reader.readLine()) != null) {
						strBuilder.append(tmp+line);
					}
					String temp = strBuilder.toString();					
					bw.write(temp.replaceAll("(?<!:)\\/\\/.*|\\/\\*(\\s|.)*?\\*\\/", ""));					
					bw.flush();
					bw.close();
					reader.close();
				} else {
					String out = f.toString().replace("E:\\", "D:\\");
					FileInputStream is = new FileInputStream(f);
					FileOutputStream fos = new FileOutputStream(out);
					int data;
					while ((data = is.read()) != -1) {
						fos.write(data);
					}
					is.close();
					fos.close();
				}
			}
		}
	}

}
