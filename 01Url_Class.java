import java.io.*;
import java.net.*;
class UrlConEX{
	public static void main(String[] args)
	{
		try{
			URL url = new URL("https://www.w3schools.com/");
			URLConnection urlcon = url.openConnection();
			InputStream steram = urlcon.getInputStream();
			int i;
			while((i=steram.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
