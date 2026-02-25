package prjArt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CSVUtil {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub

		FileReader freader = new FileReader("C:\\Users\\Admin\\Downloads\\login_data_csv.csv",StandardCharsets.UTF_8);
		CSVReader reader = new CSVReader(freader);
//		System.out.println(reader.getLinesRead());
//		System.out.println(reader.iterator());
//		System.out.println(reader.readAll());
		String[] lines= {};
		while(true)
		{
			 lines=reader.readNext();
			 
			 if(lines==null)
				 break;
			 
			 if((int)lines[0].charAt(0)==65279)
					continue;
			 System.out.println("\t"+lines[0]+"\t"+lines[1]);
			 
		}
//		List<String[]> lst = reader.readAll();
//		for (int i = 0; i < lst.size(); i++) {
//			//System.out.println((int)lst.get(i)[0].charAt(0));
//			
//			if((int)lst.get(i)[0].charAt(0)==65279)
//				continue;
//			System.out.println(lst.get(i)[0]+"\t"+lst.get(i)[1]);
//		}

	}

}
