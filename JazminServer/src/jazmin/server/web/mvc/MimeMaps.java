package jazmin.server.web.mvc;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author yama
 *
 */
public class MimeMaps {
	private static Map<String,String>mimeMaps=new HashMap<String, String>();
	static{
		mimeMaps.put("bcpio","application/x-bcpio");
		mimeMaps.put("mpga","audio/mpeg");
		mimeMaps.put("xwd","image/x-xwindowdump");
		mimeMaps.put("csh","application/x-csh");
		mimeMaps.put("latex","application/x-latex");
		mimeMaps.put("asf","video/x.ms.asf");
		mimeMaps.put("aiff","audio/x-aiff");
		mimeMaps.put("asc","text/plain");
		mimeMaps.put("aifc","audio/x-aiff");
		mimeMaps.put("dll","application/x-msdownload");
		mimeMaps.put("crt","application/x-x509-ca-cert");
		mimeMaps.put("dxr","application/x-director");
		mimeMaps.put("odt","application/vnd.oasis.opendocument.text");
		mimeMaps.put("ods","application/vnd.oasis.opendocument.spreadsheet");
		mimeMaps.put("zip","application/zip");
		mimeMaps.put("ief","image/ief");
		mimeMaps.put("odp","application/vnd.oasis.opendocument.presentation");
		mimeMaps.put("spl","application/x-futuresplash");
		mimeMaps.put("odm","application/vnd.oasis.opendocument.text-master");
		mimeMaps.put("gtar","application/x-gtar");
		mimeMaps.put("odi","application/vnd.oasis.opendocument.image");
		mimeMaps.put("js","application/javascript");
		mimeMaps.put("odg","application/vnd.oasis.opendocument.graphics");
		mimeMaps.put("odf","application/vnd.oasis.opendocument.formula");
		mimeMaps.put("odc","application/vnd.oasis.opendocument.chart");
		mimeMaps.put("odb","application/vnd.oasis.opendocument.database");
		mimeMaps.put("oda","application/oda");
		mimeMaps.put("json","application/json");
		mimeMaps.put("xul","application/vnd.mozilla.xul+xml");
		mimeMaps.put("mpeg","video/mpeg");
		mimeMaps.put("tiff","image/tiff");
		mimeMaps.put("mpg","video/mpeg");
		mimeMaps.put("tif","image/tiff");
		mimeMaps.put("tar.gz","application/x-gtar");
		mimeMaps.put("mpe","video/mpeg");
		mimeMaps.put("xht","application/xhtml+xml");
		mimeMaps.put("svgz","image/svg+xml");
		mimeMaps.put("mov","video/quicktime");
		mimeMaps.put("eps","application/postscript");
		mimeMaps.put("cpt","application/mac-compactpro");
		mimeMaps.put("cdf","application/x-netcdf");
		mimeMaps.put("mol","chemical/x-mdl-molfile");
		mimeMaps.put("ico","image/x-icon");
		mimeMaps.put("wmls","text/vnd.wap.wmlscript");
		mimeMaps.put("wav","audio/x-wav");
		mimeMaps.put("rtx","text/richtext");
		mimeMaps.put("dvi","application/x-dvi");
		mimeMaps.put("ice","x-conference/x-cooltalk");
		mimeMaps.put("apk","application/vnd.android.package-archive");
		mimeMaps.put("tgz","application/x-gtar");
		mimeMaps.put("snd","audio/basic");
		mimeMaps.put("dir","application/x-director");
		mimeMaps.put("wmlc","application/vnd.wap.wmlc");
		mimeMaps.put("rtf","application/rtf");
		mimeMaps.put("mp3","audio/mpeg");
		mimeMaps.put("wml","text/vnd.wap.wml");
		mimeMaps.put("mp2","audio/mpeg");
		mimeMaps.put("xsl","application/xml");
		mimeMaps.put("tr","application/x-troff");
		mimeMaps.put("bin","application/octet-stream");
		mimeMaps.put("tsv","text/tab-separated-values");
		mimeMaps.put("xsd","application/xml");
		mimeMaps.put("lha","application/octet-stream");
		mimeMaps.put("gz","application/gzip");
		mimeMaps.put("pgn","application/x-chess-pgn");
		mimeMaps.put("smi","application/smil");
		mimeMaps.put("pgm","image/x-portable-graymap");
		mimeMaps.put("qml","text/x-qml");
		mimeMaps.put("man","application/x-troff-man");
		mimeMaps.put("rgb","image/x-rgb");
		mimeMaps.put("vxml","application/voicexml+xml");
		mimeMaps.put("html","text/html");
		mimeMaps.put("kar","audio/midi");
		mimeMaps.put("sgml","text/sgml");
		mimeMaps.put("htm","text/html");
		mimeMaps.put("htc","text/x-component");
		mimeMaps.put("xslt","application/xslt+xml");
		mimeMaps.put("gzip","application/gzip");
		mimeMaps.put("sh","application/x-sh");
		mimeMaps.put("vrml","model/vrml");
		mimeMaps.put("silo","model/mesh");
		mimeMaps.put("jsp","text/html");
		mimeMaps.put("dtd","application/xml-dtd");
		mimeMaps.put("tex","application/x-tex");
		mimeMaps.put("wtls-ca-certificate","application/vnd.wap.wtls-ca-certificate");
		mimeMaps.put("rv","video/vnd.rn-realvideo");
		mimeMaps.put("movie","video/x-sgi-movie");
		mimeMaps.put("skt","application/x-koan");
		mimeMaps.put("rm","audio/x-pn-realaudio");
		mimeMaps.put("cab","application/x-cabinet");
		mimeMaps.put("class","application/java-vm");
		mimeMaps.put("skp","application/x-koan");
		mimeMaps.put("skm","application/x-koan");
		mimeMaps.put("jpeg","image/jpeg");
		mimeMaps.put("ez","application/andrew-inset");
		mimeMaps.put("wmlsc","application/vnd.wap.wmlscriptc");
		mimeMaps.put("ra","audio/x-pn-realaudio");
		mimeMaps.put("skd","application/x-koan");
		mimeMaps.put("xhtml","application/xhtml+xml");
		mimeMaps.put("swf","application/x-shockwave-flash");
		mimeMaps.put("qt","video/quicktime");
		mimeMaps.put("xpm","image/x-xpixmap");
		mimeMaps.put("hqx","application/mac-binhex40");
		mimeMaps.put("rdf","application/rdf+xml");
		mimeMaps.put("exe","application/octet-stream");
		mimeMaps.put("ppt","application/vnd.ms-powerpoint");
		mimeMaps.put("rpm","application/x-rpm");
		mimeMaps.put("pps","application/vnd.ms-powerpoint");
		mimeMaps.put("pdf","application/pdf");
		mimeMaps.put("mesh","model/mesh");
		mimeMaps.put("xcf","image/xcf");
		mimeMaps.put("pdb","chemical/x-pdb");
		mimeMaps.put("ppm","image/x-portable-pixmap");
		mimeMaps.put("svg","image/svg+xml");
		mimeMaps.put("ps","application/postscript");
		mimeMaps.put("cpio","application/x-cpio");
		mimeMaps.put("tcl","application/x-tcl");
		mimeMaps.put("smil","application/smil");
		mimeMaps.put("vcd","application/x-cdlink");
		mimeMaps.put("sit","application/x-stuffit");
		mimeMaps.put("roff","application/x-troff");
		mimeMaps.put("z","application/compress");
		mimeMaps.put("xbm","image/x-xbitmap");
		mimeMaps.put("hdf","application/x-hdf");
		mimeMaps.put("t","application/x-troff");
		mimeMaps.put("jpg","image/jpeg");
		mimeMaps.put("jpe","image/jpeg");
		mimeMaps.put("ustar","application/x-ustar");
		mimeMaps.put("texi","application/x-texinfo");
		mimeMaps.put("mif","application/vnd.mif");
		mimeMaps.put("sv4crc","application/x-sv4crc");
		mimeMaps.put("mid","audio/midi");
		mimeMaps.put("sv4cpio","application/x-sv4cpio");
		mimeMaps.put("pbm","image/x-portable-bitmap");
		mimeMaps.put("texinfo","application/x-texinfo");
		mimeMaps.put("dcr","application/x-director");
		mimeMaps.put("wbmp","image/vnd.wap.wbmp");
		mimeMaps.put("java","text/plain");
		mimeMaps.put("avi","video/x-msvideo");
		mimeMaps.put("pnm","image/x-portable-anymap");
		mimeMaps.put("xyz","chemical/x-xyz");
		mimeMaps.put("tar","application/x-tar");
		mimeMaps.put("midi","audio/midi");
		mimeMaps.put("gif","image/gif");
		mimeMaps.put("ott","application/vnd.oasis.opendocument.text-template");
		mimeMaps.put("ots","application/vnd.oasis.opendocument.spreadsheet-template");
		mimeMaps.put("xml","application/xml");
		mimeMaps.put("otp","application/vnd.oasis.opendocument.presentation-template");
		mimeMaps.put("png","image/png");
		mimeMaps.put("ras","image/x-cmu-raster");
		mimeMaps.put("rar","application/x-rar-compressed");
		mimeMaps.put("mathml","application/mathml+xml");
		mimeMaps.put("shar","application/x-shar");
		mimeMaps.put("oti","application/vnd.oasis.opendocument.image-template");
		mimeMaps.put("ram","audio/x-pn-realaudio");
		mimeMaps.put("oth","application/vnd.oasis.opendocument.text-web");
		mimeMaps.put("otg","application/vnd.oasis.opendocument.graphics-template");
		mimeMaps.put("sgm","text/sgml");
		mimeMaps.put("otf","application/vnd.oasis.opendocument.formula-template");
		mimeMaps.put("jp2","image/jpeg2000");
		mimeMaps.put("nc","application/x-netcdf");
		mimeMaps.put("iges","model/iges");
		mimeMaps.put("otc","application/vnd.oasis.opendocument.chart-template");
		mimeMaps.put("au","audio/basic");
		mimeMaps.put("doc","application/msword");
		mimeMaps.put("aif","audio/x-aiff");
		mimeMaps.put("xls","application/vnd.ms-excel");
		mimeMaps.put("lzh","application/octet-stream");
		mimeMaps.put("ai","application/postscript");
		mimeMaps.put("etx","text/x-setext");
		mimeMaps.put("ms","application/x-troff-ms");
		mimeMaps.put("ogg","application/ogg");
		mimeMaps.put("jar","application/java-archive");
		mimeMaps.put("wrl","model/vrml");
		mimeMaps.put("igs","model/iges");
		mimeMaps.put("me","application/x-troff-me");
		mimeMaps.put("jad","text/vnd.sun.j2me.app-descriptor");
		mimeMaps.put("msi","application/octet-stream");
		mimeMaps.put("txt","text/plain");
		mimeMaps.put("msh","model/mesh");
		mimeMaps.put("jnlp","application/x-java-jnlp-file");
		mimeMaps.put("dms","application/octet-stream");
		mimeMaps.put("src","application/x-wais-source");
		mimeMaps.put("ser","application/java-serialized-object");
		mimeMaps.put("csv","text/comma-separated-values");
		mimeMaps.put("css","text/css");
		mimeMaps.put("bmp","image/bmp");
		mimeMaps.put("asx","video/x.ms.asx");
	}
	//
	public static String getMimeTypeByType(String fileType){
		return mimeMaps.get(fileType);
	}
	//
	public static String getMimeTypeByFileName(String fileName){
		int lastIdxOfDot=fileName.lastIndexOf('.');
		if(lastIdxOfDot==-1||lastIdxOfDot==fileName.length()){
			return null;
		}
		//
		String fileType=fileName.substring(lastIdxOfDot+1);
		return getMimeTypeByType(fileType);
	}
	//
	public static String getMimeTypeByFile(File file){
		return getMimeTypeByFileName(file.getName());
	}
}
