import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

//Question: Which Digimon is a Plant-type in Digimon Story: Cyber Sluthes?
public class Lab5{
  public static void main (String[] args){
    String DigimonFile = "Digimon_CS.csv";
    List<String> DigiList= new ArrayList<String>();
    List<String> DN = new ArrayList<String>();
    List<String> DName = new ArrayList<String>();
    List<String> DS = new ArrayList<String>();
    List<String> DT = new ArrayList<String>();
    List<String> DA = new ArrayList<String>();
    List<String> DM = new ArrayList<String>();
    List<String> DE = new ArrayList<String>();
    List<String> HP = new ArrayList<String>();
    List<String> SP = new ArrayList<String>();
    List<String> ATK = new ArrayList<String>();
    List<String> DEF = new ArrayList<String>();
    List<String> INT = new ArrayList<String>();
    List<String> SPD = new ArrayList<String>();


    int n = 1;
    new readLine(DigimonFile, DigiList);
    
    
    while(n <= DigiList.size()-1){
        Scanner scan = new Scanner (DigiList.get(n));
        scan.useDelimiter(",");

        while(scan.hasNext()){
            DN.add(scan.next());
            DName.add(scan.next());
            DS.add(scan.next());
            DT.add(scan.next());
            DA.add(scan.next());
            DM.add(scan.next());
            DE.add(scan.next());
            HP.add(scan.next());
            SP.add(scan.next());
            ATK.add(scan.next());
            DEF.add(scan.next());
            INT.add(scan.next());
            SPD.add(scan.next());
        }
        n++;
    }

    search(DA, DName);
  }

  public static void search(List<String> DA, List<String> DName){
      String plant = "Plant";
      for (int i = 0; i <= DA.size()-1; i++){
          if (DA.get(i).equals(plant)){
              System.out.println(DName.get(i));
          }
          //System.out.println(DA.get(i));
      }
  }
}

class readLine{
    public readLine(String DigimonFile, List<String> q){
        Scanner scanner = null;
        try{
            scanner = new Scanner(new File(DigimonFile));
        }
        catch (Exception e){
            System.out.println("There was a problem");
            }
        while (scanner.hasNextLine()) {
            q.add(scanner.nextLine());
            // use scanner here
        }
    }
}