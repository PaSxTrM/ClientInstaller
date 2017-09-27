package me.xtrm.EZInstaller;

/**
 * @author xTrM_
 */
public class Referances {

//	CHANGE THESE VARS:
	public static String ClientName = "YourClientName";
	public static String JarLink = "https://YourWebsite.com/YourClient.jar";
	
	
//	DONT CHANGE THESE VARS!!!!!
	public static final String APPDATA = System.getenv("APPDATA");
	
	public static final String MINECRAFT_FOLDER = APPDATA + "\\" + ".minecraft";
	public static final String VERSIONS_FOLDER = MINECRAFT_FOLDER + "\\" + "versions";	

	public static final String CLIENT_FOLDER = VERSIONS_FOLDER + "\\" + ClientName;
	
	public static final String JSON_FILE = Referances.CLIENT_FOLDER + "\\" + Referances.ClientName + ".json";
	public static final String JSON_LINK = "https://pastebin.com/raw/DhUyKWta"; // DO NOT TOUCH THIS! It will automaticly update itself with the CLIENT_NAME var
	
	public static final String JAR_FILE = Referances.CLIENT_FOLDER + "\\" + Referances.ClientName + ".jar";

}
