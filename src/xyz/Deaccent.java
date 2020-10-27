package xyz;

import java.io.File;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.Enumeration;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.apache.commons.io.FilenameUtils;
public class Deaccent {

	public static void main(String[] args) throws Exception{

		//String str="·¡È…ÌÕÛ”˙⁄Ò—¸‹";
		String str="NestlÈ inventory-EOX.zip";
		//System.out.println(deAccent(str));
		//File file=new File("C:\\Users\\praveen.kumar\\Downloads\\sample\\NestlÈ inventory-EOX.zip");
		File file=new File("C:\\Users\\praveen.kumar\\Downloads\\sample\\sample\\Nestle inventory-EOX.zip");
		validateZipFile(file);

	}
	
	  private static void validateZipFile(File targetFile) throws Exception{
		  System.out.println("validateZipFile...");
	        try {
	            ZipFile zipFile = new ZipFile(targetFile,Charset.forName("ISO-8859-1"));
	            Enumeration<? extends ZipEntry> entries = zipFile.entries();
	            boolean foundCSV = false;
	            while (entries.hasMoreElements()) {
	            	
	                ZipEntry entry = entries.nextElement();
	                //String fileNameInsideZip = FilenameUtils.getBaseName(entry.getName());
	               // fileNameInsideZip=deAccent(fileNameInsideZip);
	                boolean isCsv = FilenameUtils.getExtension(entry.getName())
	                                             .equals("csv");
	                if (isCsv) {
	                    if (entry.getSize() > 0) {
	                        foundCSV = true;
	                    } else {
	                    	System.out.println("Zip contains invalid CSV of 0 bytes.");
	                        throw new Exception("Zip contains invalid CSV of 0 bytes.");
	                    }
	                }
	            }
	            if (!foundCSV) {
	            	System.out.println("Upload document does not contain CSV");
	                throw new Exception("Upload document does not contain CSV");
	            }
	        } catch (ZipException zipException) {
	            System.out.println("Upload document is not a zip file");
	            throw new Exception("Upload document is not a zip file");
	        }
	        System.out.println("Done...");
	    }
	public static String deAccent(String str) {
	    String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
	    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	    return pattern.matcher(nfdNormalizedString).replaceAll("");
	}

}
