import java.io.*;
import java.util.*;
import java.text.*;
import java.nio.*;

class Games {
    
    // atributos
    private int id;
    private String name;
    private String mes;
    private String ano;
    private String owners;
    private int age; 
    private float price;
    private int dlcs;
    private ArrayList<String> language;
    private String website;
    private boolean windows;
    private boolean mac;
    private boolean linux;
    private int votes;
    private int horas;
    private int minutos;
    private String developers;
    private ArrayList<String> genres;

    //construtor - setando valores 
    public Games() {
        id = 0;
        name = "";
        mes = "";
        ano = "";
        owners = "";

        age = 0;
        price =  (float) 0.0;
        dlcs = 0;
        //language = new ArrayList<String>(); 
        language = null;

        website = "";
        windows = false;
        mac = false;
        linux = false;

        votes =  0;
        horas = 0;
        minutos = 0;
        developers = "";
        //genres = new ArrayList<String>(); 
        genres = null;
    }
    
    //construtor this - segundo data
    public Games(int id, String name, String mes, String ano, String owners, int age, float price, int dlcs, ArrayList<String> language, 
    String website, Boolean windows, boolean mac, boolean linux, int votes, int horas, int minutos, String developers, 
    ArrayList<String> genres) {
        this.id = id;
        this.name = name;
        this.mes = mes;
        this.ano = ano;
        this.owners = owners;
        this.age = age;
        this.price = price;
        this.dlcs = dlcs;
        this.language = language;
        this.website = website;
        this.linux = linux;
        this.mac = mac;
        this.windows = windows;
        this.votes = votes;
        this.horas = horas;
        this.minutos = minutos;
        this.developers = developers;
        this.genres = genres;
    }
    

    //---------------------------------------------------------------------------------------------
    //set 

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setOwners (String owners) {
        this.owners = owners;
    }
 
    public void setAge (int age) {
        this.age = age;
    }

    public void setPrice (float price) {
        this.price = price;
    }

    public void setDlc (int dlcs) {
        this.dlcs = dlcs;
    }

    public void setLanguage (ArrayList<String> language) {
        this.language = language;
    }
    
    public void setWebsite (String website) {
        this.website = website;
    }

    public void setWindowns (boolean windows) {
        this.windows = windows;
    }

    public void setMac (boolean mac) {
        this.mac = mac;
    }

    public void setLinux (boolean linux) {
        this.linux = linux;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }
    
    //---------------------------------------------------------------------------------------------
    //get 
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

    public String getOwners() {
        return this.owners;
    }

    public int getAge() {
        return this.age;
    }
    
    public float getPrice() {
        return this.price;
    }

    public int getDlcs() {
        return this.dlcs;
    }

    public ArrayList<String> getLanguage() {
        return this.language;
    }

    public String getWebsite() {
        return this.website;
    }

    public boolean getWindowns() {
        return this.windows;
    }

    public boolean getMac() {
        return this.mac;
    }

    public boolean getLinux() {
        return this.linux;
    }

    public int getVotes() {
        return this.votes;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getDevelopers() {
        return this.developers;
    }

    public ArrayList<String> getGenres() {
        return this.genres;
    }

    
    //---------------------------------------------------------------------------------------------

    //clonar ??
    public Games clone() {
        Games resp = new Games();
        resp.id = this.id;
        resp.name = this.name;
        resp.mes = this.mes;
        resp.ano = this.ano;
        resp.owners = this.owners;
        resp.age = this.age;
        resp.price = this.price;
        resp.dlcs = this.dlcs;
        resp.language = this.language;
        resp.website = this.website;

        resp.linux = this.linux;
        resp.mac = this.mac;
        resp.windows = this.windows;

        resp.votes = this.votes;
        resp.horas = this.horas;
        resp.minutos = this.minutos;
        resp.developers = this.developers;
        resp.genres = this.genres;

        return resp;
    }

    //--------------------------------------------------------------------------------------------
 
    private String removeTags(String line){
        String resp = "";
        int i = 0;

        while (i < line.length()) {
            if (line.charAt(i) == '<') {
                i++;
                while (line.charAt(i) != '>') i++;
            }else {
                resp += line.charAt(i);
            }
            i++;
        }
        return resp.replace("&nbsp;", "");
    }

    //--------------------------------------------------------------------------------------------
 
    //fazer busca de string 
    public String searchString(String file, String busca) {
        
        String buscaAux = null;
         try {
            FileReader entrada = new FileReader(file); //abrir o arquivo
            BufferedReader br = new BufferedReader(entrada); //leitor do arquivo ate a parte que quero

            buscaAux = br.readLine(); //le a linha e armazena 
            while (buscaAux != null) { //quando n for nulo comeca
                if (buscaAux.contains(busca)) { //recebe a variavel busca
                    br.close();
                    return removeTags(buscaAux); // remover as tags 
                }
                buscaAux = br.readLine(); 
                
            }

            br.close();
         } catch (IOException e) {
             e.printStackTrace();
         }

        return null;
    }

    //--------------------------------------------------------------------------------------------
 
    public void imprimir() {
        System.out.println( 
            this.id + " " +
            this.name + " " +
            this.mes + "/" +
            this.ano + " " + 
            this.owners + " " +
            this.age + " " +
            this.price + " " +
            this.dlcs + " " +
            this.language + " " +
            this.website + " " +
            this.windows + " " +
            this.mac + " " +
            this.linux + " " +
            this.votes + "% " +
            this.horas + " " + this.minutos + " " +
            this.developers + " " +
            this.genres 
        );
    }   

    //---------------------------------------------------------------------------------------------
    public void ler(String fileCSV) throws ParseException {

        String file = "/tmp/games.csv";
        String aux = "";
        aux = searchString(file, fileCSV);
    
        String array[] = aux.split(",");
    
        this.id = Integer.parseInt(array[0]);
    
        this.name = array[1];
          
        String mesAux = array[2];
        String aux1M = mesAux.replace("\"", "");
        String auxM[] = aux1M.split(" ");
        String aux2M = auxM[0];
        this.mes = aux2M;
        String ano = array[3];
        String aux1A = ano.replace("\"", "");
        String aux2A = aux1A.replace(" ", "");
        this.ano = aux2A;
            
        //this.data     
        this.owners = array[4];
        this.age = Integer.parseInt(array[5]);
        this.price = Float.parseFloat(array[6]);
        this.dlcs = Integer.parseInt(array[7]);
                
        //this.language
        this.language = new ArrayList<String>();
        int comeca1 = aux.indexOf("['");
        String language2 = aux.substring(comeca1);
        int termina1 = language2.indexOf("']");
        String tot = language2.substring(0, termina1);
        String auxS = tot.replace("'", "");
        String tudo = auxS.replace("[", "");
        this.language.add(tudo);

        int recomeco;
        recomeco = aux.indexOf(",,");
        this.website = "null";
        
        if (recomeco == -1){
            recomeco = aux.indexOf("http");
    
            String novoAux = aux.substring(recomeco);
            String novoArray[] = novoAux.split(",");

            this.website = novoArray[0];
            this.windows = (novoArray[1].contentEquals("True")) ? true : false;
            this.mac = (novoArray[2].contentEquals("True")) ? true : false;
            this.linux = (novoArray[3].contentEquals("True")) ? true : false;

            /* 
            this.votes = (Integer.parseInt(novoArray[4]) / 100);
            int h = (Integer.parseInt(novoArray[5]));
            int m = (Integer.parseInt(novoArray[6]));
            int total = ((h+m)/2);
            this.horas = total*60;
            */
            this.developers = novoArray[7];

            this.developers = novoArray[8];
            
            
            /* this.genres */
        }
            
        //840010,Garden Paws,"Dec 18, 2018",50000 - 100000,0,19.99,2,['English'],http://www.gardenpawsgame.com,True,True,False,1924,174,346,Bitten Toast Games Inc.,"Adventure,Indie,RPG,Simulation"
        //840010 Garden Paws Dec/2018 50000 - 100000 0 19.99 2 [English] http://www.gardenpawsgame.com true true false 92% 5h 46m Bitten Toast Games Inc. [Adventure, Indie, RPG, Simulation]

        else{

            String novoAux = aux.substring(recomeco);
            String novoArray[] = novoAux.split(",");
            
            this.windows = (novoArray[2].contentEquals("True")) ? true : false;
            this.mac = (novoArray[3].contentEquals("True")) ? true : false;
            this.linux = (novoArray[4].contentEquals("True")) ? true : false;

            //this.votes = (Integer.parseInt(novoArray[5]) / 100);
            //this.avgtime = (Integer.parseInt(novoArray[7]) / 100);

            this.developers = novoArray[8];
            this.developers = novoArray[9];
            /* this.genres */
        }
    }

}

public class GamesEmJava{
    
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main(String[] args) throws ParseException{

        Games game;

        try (Scanner ler = new Scanner(System.in)) {
            String entrada = new String();

            while(isFim(entrada) == false){
                
                entrada = ler.nextLine();
                
                if(isFim(entrada) == true){
                    break;
                }
                else{
                    game = new Games();
                    game.ler(entrada);
                    game.imprimir();
                }
            }
        }
    }

}