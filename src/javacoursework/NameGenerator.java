package javacoursework;

public class NameGenerator {

	public static void main(String[] args){

        String[] firstNames = {"Adam","Alexis","Dennis","Jose", "Jessica", "Meghan",
        		"Memphis", "Nicky", "Sarah", "William"};

        String[] lastNames = { "Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", 
        		"Thompson", "Perez", "Snow", "Tran"};

        //Loop through each first name

        for(int firstNameIndex = 0; firstNameIndex < firstNames.length; firstNameIndex++){
            //Get the current first name
            String currentFirstName = firstNames[firstNameIndex];

            //Loop through each last name
            for(int lastNameIndex = 0; lastNameIndex < lastNames.length; lastNameIndex++){
                String currentLastName = lastNames[lastNameIndex];

                //print the first name last name combo
                System.out.println(currentFirstName+" "+currentLastName);
            }
        }
    }
}
