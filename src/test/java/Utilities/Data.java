package Utilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Data extends BaseClass{
	
	public static ArrayList<String> values=new ArrayList<String>();
	public static ArrayList<String> values_ALC_4361=new ArrayList<String>();
	public static ArrayList<String> values_ALC_380=new ArrayList<String>();
	public static ArrayList<String> values_ALC_4360=new ArrayList<String>();
	
	public static String mname4360;
	public static   String mnum4360;
	 public static  String b1number4360;
	 public static  String b1name4360;
	 public static  String b1id4360;
	 public static  String b2number4360;
	 public static  String b2name4360;
	 public static String b2id4360;
	 public static String pnumber4360;
	 public static String pname4360;
	 public static String pid4360;
	 public static String bonusname4360;
	 public static String bonusid4360;
	public void runNewman() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run PlasticBankonlytillmemberbranchesandprocessors.postman_collection.json --export-environment variable.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "b3randomBranchName".equals(key) || "b3randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key)) {
                        System.out.println(key + ": " + value);
                        values.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
          member_Name = values.get(0); 
		  member_Number=values.get(1);
		  branch1_Name = values.get(3); 
		  branch1_Number =values.get(2);
		  branch2_Name = values.get(5);
		  branch2_Number =values.get(4); 
		  branch3_Name = values.get(7);
		  branch3_Number = values.get(6); 
		  processor_Name = values.get(9); 
		  processor_Number = values.get(8);
		  bonusName = values.get(10);
	    
	    
	}
	
	public void runNewmanFor_ALC_4361() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run ALC_4361.postman_collection.json --export-environment variable_ALC_4361.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable_ALC_4361.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        values_ALC_4361.add(value);
                       
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
   }
	
	
	
	public void runNewmanFor_ALC_380() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run dtt.postman_collection.json --export-environment variable_ALC_380.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable_ALC_380.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "m2randomUsername".equals(key) || "m2randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        values_ALC_380.add(value);
                       
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
   }
	
	
	
	
	public void runNewmanmb1b2pbonuspaid() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run mb1b2p_with_paid_bonus.postman_collection.json --export-environment variablebonuspaid.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variablebonuspaid.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key)) {
                        System.out.println(key + ": " + value);
                        values.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
            
	    
	}
	
	public void runNewmanmb1b2pnobonuspaid() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run mb1b2p_without_bonus_upgrade.postman_collection.json --export-environment variablenobonuspaid.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variablenobonuspaid.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key) || "b1branchid".equals(key) || "b2branchid".equals(key) || "p1processorid".equals(key) || "bonusOrderId".equals(key)) {
                        System.out.println(key + ": " + value);
                        values_ALC_4360.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	   
        mname4360=values_ALC_4360.get(0);
        mnum4360=values_ALC_4360.get(1);
        b1number4360=values_ALC_4360.get(2);
        b1name4360=values_ALC_4360.get(3);
        b1id4360=values_ALC_4360.get(4);
        b2number4360=values_ALC_4360.get(5);
        b2name4360=values_ALC_4360.get(6);
        b2id4360=values_ALC_4360.get(7);
        pnumber4360=values_ALC_4360.get(8);
        pname4360=values_ALC_4360.get(9);
        pid4360=values_ALC_4360.get(10);
        bonusname4360=values_ALC_4360.get(11);
        bonusid4360=values_ALC_4360.get(12);
    }
	
	public void runonceFor_ALC_4360() throws IOException {
		
			runNewmanmb1b2pnobonuspaid();
		
	}
 
	public void runonceFor_ALC_1711() throws IOException 	{
		
			runNewmanmb1b2pbonuspaid();
		
	}

	
}
