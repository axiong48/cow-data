package Backend;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reader{

	public static String[][] cowsData;

	public static String[] getCow(int i) {
		return cowsData[i];
	}


	public static String getName(int i) {
		return cowsData[i][0];
	}


	public static String[] getCow(String name) {
		for (String[] cow : cowsData) {
			if (cow[0].equalsIgnoreCase(name)) { // Assuming the cow's name is stored in the first index of each array
				return cow; // Return the array representing the cow's attributes
			}
		}

		return null; // Return null if the cow with the given name is not found
	}

	public static int getSize() {
		int rowCount = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("cows_information_healthy_with_symptoms_corrected.csv"))) {
			// Skip the header
			br.readLine();

			while (br.readLine() != null) {
				rowCount++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public static void initialize_cows() {
		String csvFile = "cows_information_healthy_with_symptoms_corrected.csv";
		int rowCount = 0;

		// First, count the number of data rows (excluding header)
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			// Skip the header
			br.readLine();

			while (br.readLine() != null) {
				rowCount++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Now that we have the row count, initialize the array
		cowsData = new String[rowCount][];

		// Second pass to actually read the data
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			String line;

			// Skip the header again
			br.readLine();

			int rowIndex = 0;
			while ((line = br.readLine()) != null) {
				// Use comma as separator
				String[] cow = line.split(",");
				cowsData[rowIndex++] = cow;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		//		for (int i = 0; i < 15;i++) {
		//			System.out.println(cowsData[1][i] + " ");
		//		}
	}
	public static String[] analyze() {
		return analyzeCows(cowsData);
	}

	public static String[] analyzeCows(String[][] cows) {
		List<String> sickCowsList = new ArrayList<>();

		for (String[] cow : cows) {
			String cowName = cow[0]; // Assuming the cow's name is in the first index

			// Variables to track symptoms
			boolean apetite = cow[15].equalsIgnoreCase("Reduced");
			boolean blisters = cow[4].equalsIgnoreCase("hooves") || cow[4].equalsIgnoreCase("tongue")
					|| cow[4].equalsIgnoreCase("lips") || cow[4].equalsIgnoreCase("nostrils")
					|| cow[4].equalsIgnoreCase("teats");
			boolean congestion = cow[6].equalsIgnoreCase("Yes");
			boolean cough = cow[14].equalsIgnoreCase("yes");
			boolean fever = Double.parseDouble(cow[12]) > 39.4;
			boolean itching = cow[11].equalsIgnoreCase("itching");
			boolean lesions = cow[11].equalsIgnoreCase("lesions");
			boolean redness = cow[11].equalsIgnoreCase("redness");
			boolean scabs = cow[11].equalsIgnoreCase("scabs");
			boolean low_activity = cow[1].equalsIgnoreCase("low");
			boolean milk = cow[9].equalsIgnoreCase("irregular");
			boolean swelling = cow[13].equalsIgnoreCase("head") || cow[13].equalsIgnoreCase("tongue")
					|| cow[13].equalsIgnoreCase("body");

			// Diagnose diseases
			boolean blue_tongue = (fever ? 1 : 0) + (swelling ? 1 : 0) + (low_activity ? 1 : 0) >= 2;
			boolean BRD = (cough ? 1 : 0) + (congestion ? 1 : 0) + (fever ? 1 : 0) + (low_activity ? 1 : 0)
					+ (apetite ? 1 : 0) >= 3;
					boolean mastitis = (swelling ? 1 : 0) + (redness ? 1 : 0) + (fever ? 1 : 0) + (milk ? 1 : 0) >= 3;
					boolean FMD = (fever ? 1 : 0) + (blisters ? 1 : 0) + (low_activity ? 1 : 0) >= 2;
					boolean PM = (scabs ? 1 : 0) + (itching ? 1 : 0) + (lesions ? 1 : 0) >= 2;

					// Add cow to the list of sick cows and update its information if it's sick
					if (blue_tongue || BRD || mastitis || FMD || PM) {
						sickCowsList.add(cowName);
						// Add disease information to the end of the cow's information array
						StringBuilder infoBuilder = new StringBuilder(); // Use StringBuilder for efficient string concatenation
						if (blue_tongue) {
							infoBuilder.append(cow[0] + " may have blue tongue. Blue \n"
									+ "tongue is a viral disease spread by insects \n"
									+ " characterized by fever, low activity, and \n"
									+ "swelling. Remidies include the monovalent \n"									
									+ "attenuated modified-live vaccine against \n"
									+ "serotype 10. Applying prophylactic \n"
									+ "immunization and insecticides to the rest  \n"
									+ "of the cows to prevent spread \n\n\n");

						}
						if (BRD) {
							infoBuilder.append(cow[0] + " may have Bovine Respiratory \n"
									+ "Disease. Bovine Respiratory Disease is a \n"
									+ "bacterial infection that affects \n"
									+ "lungs and respiratory tract, \n"
									+ "exacerbated by stress and \n"
									+ "environmental factors. Remedies \n"
									+ "include vaccinations against common \n"
									+ "pathogens, good ventilation, proper \n"
									+ "handling, and maintaining optimal \n"
									+ "nutrition\n\n\n");
						}
						if (mastitis) {
							infoBuilder.append(cow[0] + " may have Mastitis. Mastitis \n"
									+ "is a bacterial infection which causes an \n"
									+ "inflammation of the udder tissue. Remedies \n"
									+ "include regular post-milking disinfection and \n"
									+ "culling cows with chronic infections. Maintaining \n"
									+ "proper milking hygiene will prevent this in \n"
									+ "the future\n\n\n");
						}
						if (FMD) {
							infoBuilder.append(cow[0] + " may have Foot and Mouth Disease. \n"
									+ "Foot and Mouth Disease is a a highly contagious \n"
									+ "viral disease which is characterized by the \n"
									+ "development of blisters chiefly in the mouth and on \n"
									+ "the feet. Remedies include strict biosecurity \n"
									+ "measures, control and surveillance of animal \n"
									+ "movement, and vaccinations where available\n\n\n");
						}
						if (PM) {
							infoBuilder.append(cow[0] + " may have Psoroptic mange. \n"
									+ "Psoroptic mange is a highly infectious disease \n"
									+ "transmitted by direct contact, scabs and \n"
									+ "legions are often caused by the mites. Remedies \n"
									+ "include ivermectin (0.3 mg/kg, orally). Treatment \n"
									+ "should be repeated every 2 weeks for three doses.\n\n\n");
						}
						// Update cow's information array

						cow[10] = infoBuilder.toString();
						//	            for(int i = 0; i <15 ; i++) {
						//                	System.out.println(cow[i]);
						//                }
					}
		}
		// Convert the list of sick cow names to an array and return
		return sickCowsList.toArray(new String[0]);
	}

}



