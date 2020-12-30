package com.navin;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {

	public static void main(String[] args) throws Exception, FileNotFoundException {

		String details = "Albert Ben ";
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		File f = new File("C:\\Users\\alber\\MyChannel.jpg");
		FileOutputStream fos = new FileOutputStream(f);

		fos.write(out.toByteArray());
		fos.flush();

	}

}
