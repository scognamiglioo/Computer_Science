
import java.io.*;
import java.util.*;
import java.text.*;



// ----------------------------------------------------------------------------------------------------------------- //

class Game {

    static SimpleDateFormat default_dateFormat = new SimpleDateFormat("MMM/yyyy", Locale.ENGLISH);

    private String name, owners, website, developers;
    private ArrayList<String> languages, genres;
    private Date release_date;
    private int app_id, age, dlcs, avg_playtime;
    private float price, upvotes;
    private boolean windows, mac, linux;

    public Game() {

        this.name = this.owners = this.website = this.developers = null;
        this.languages = new ArrayList<String>();
        this.genres = new ArrayList<String>();
        this.release_date = null;
        this.app_id = this.age = this.dlcs = this.avg_playtime = -1;
        this.price = this.upvotes = -1;
        this.windows = this.mac = this.linux = false;
    }

    public Game(String name, String owners, String website, String developers, ArrayList<String> languages, ArrayList<String> genres, Date release_date, int app_id, int age, int dlcs, int upvotes, int avg_playtime, float price, boolean windows, boolean mac, boolean linux) {

        this.name = name;
        this.owners = owners;
        this.website = website;
        this.developers = developers;
        this.languages = languages;
        this.genres = genres;
        this.release_date = release_date;
        this.app_id = app_id;
        this.age = age;
        this.dlcs = dlcs;
        this.upvotes = upvotes;
        this.avg_playtime = avg_playtime;
        this.price = price;
        this.windows = windows;
        this.mac = mac;
        this.linux = linux;
    }

    public void setName(String name) { this.name = name; }
    public void setOwners(String owners) { this.owners = owners; }
    public void setWebsite(String website) { this.website = website; }
    public void setDevelopers(String developers) { this.developers = developers; }
    public void setLanguages(ArrayList<String> languages) { this.languages = languages; }
    public void setGenres(ArrayList<String> genres) { this.genres = genres; }
    public void setReleaseDate(Date release_date) { this.release_date = release_date; }
    public void setAppId(int app_id) { this.app_id = app_id; }
    public void setAge(int age) { this.age = age; }
    public void setDlcs(int dlcs) { this.dlcs = dlcs; }
    public void setAvgPlaytime(int avg_playtime) { this.avg_playtime = avg_playtime; }
    public void setPrice(float price) { this.price = price; }
    public void setUpvotes(float upvotes) { this.upvotes = upvotes; }
    public void setWindows(boolean windows) { this.windows = windows; }
    public void setMac(boolean mac) { this.mac = mac; }
    public void setLinux(boolean linux) { this.linux = linux; }

    public String getName() { return this.name; }
    public String getOwners() { return this.owners; }
    public String getWebsite() { return this.website; }
    public String getDevelopers() { return this.developers; }
    public ArrayList<String> getLanguages() { return this.languages; }
    public ArrayList<String> getGenres() { return this.genres; }
    public Date getReleaseDate() { return this.release_date; }
    public int getAppId() { return this.app_id; }
    public int getAge() { return this.age; }
    public int getDlcs() { return this.dlcs; }
    public int getAvgPlaytime() { return this.avg_playtime; }
    public float getPrice() { return this.price; }
    public float getUpvotes() { return this.upvotes; }
    public boolean getWindows() { return this.windows; }
    public boolean getMac() { return this.mac; }
    public boolean getLinux() { return this.linux; }
    
    public Game clone() {

        Game cloned = new Game();

        cloned.name = this.name;
        cloned.owners = this.owners;
        cloned.website = this.website;
        cloned.developers = this.developers;
        cloned.languages = this.languages;
        cloned.genres = this.genres;
        cloned.release_date = this.release_date;
        cloned.app_id = this.app_id;
        cloned.age = this.age;
        cloned.dlcs = this.dlcs;
        cloned.avg_playtime = this.avg_playtime;
        cloned.price = this.price;
        cloned.upvotes = this.upvotes;
        cloned.windows = this.windows;
        cloned.mac = this.mac;
        cloned.linux = this.linux;

        return cloned;
    }

    public void read(String line) {

        char c_search;
        int index = 0, atr_index = 0;

        // ---------------------------------- //

        // Find "AppID"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {
                
                this.app_id = Integer.parseInt(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // ---------------------------------- //
        
        // Find "Name"
        if(line.charAt(atr_index) != ',') {

            if(line.charAt(atr_index) == '\"') {
                
                atr_index++;
                c_search = '\"';
            }
            else c_search = ',';
            
            while(true) {

                index++;

                if(line.charAt(index) == c_search) {
                    
                    this.name = line.substring(atr_index, index);

                    if(c_search == ',') index++;
                    else if(c_search == '\"') index += 2;
                    
                    atr_index = index;
                    break;
                }
            }
        }
        else atr_index = ++index;

        // ---------------------------------- //
        
        // Find release date
        if(line.charAt(atr_index) != ',') {

            SimpleDateFormat df;
            
            if(line.charAt(atr_index) == '\"') {
                
                df = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

                atr_index++;
                c_search = '\"';
            }
            else {
                
                df = new SimpleDateFormat("MMM yyyy", Locale.ENGLISH);

                c_search = ',';
            }

            while(true) {

                index++;

                if(line.charAt(index) == c_search) {
                    
                    try { this.release_date = df.parse(line.substring(atr_index, index)); } 
                    catch (java.text.ParseException e) { e.printStackTrace(); }

                    if(c_search == ',') index++;
                    else if(c_search == '\"') index += 2;
                    
                    atr_index = index;
                    break;
                }
            }
        }
        else atr_index = ++index;

        // ---------------------------------- //
        
        // Find "Owners"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {
                
                this.owners = line.substring(atr_index, index);

                atr_index = ++index;
                break;
            }
        }

        // ---------------------------------- //
        
        // Find "Age"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {

                this.age = Integer.parseInt(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // ---------------------------------- //
        
        // Find "Price"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {
                
                this.price = Float.parseFloat(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // ---------------------------------- //
        
        // Find "DLCs"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {
                
                this.dlcs = Integer.parseInt(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // ---------------------------------- //
        
        // Find "Languages"
        while(true) {

            index++;

            if(line.charAt(index) == ']') {

                index++;
                
                if(line.charAt(index) == ',') index++;
                else if(line.charAt(index) == '\"') index += 2;

                atr_index = index;
                break;
            }
            else if(line.charAt(index) == '\'') {

                int wordStart = index + 1;

                while(true) {

                    index++;

                    if(line.charAt(index) == '\'') {
                        
                        this.languages.add(line.substring(wordStart, index));
                        break;
                    }
                }
            }
        }

        // ---------------------------------- //
        
        // Find "Website"
        if(line.charAt(atr_index) != ',') {

            if(line.charAt(atr_index) == '\"') {
                
                atr_index++;
                c_search = '\"';
            }
            else c_search = ',';
            
            while(true) {

                index++;

                if(line.charAt(index) == c_search) {
                    
                    this.website = line.substring(atr_index, index);

                    atr_index = ++index;
                    break;
                }
            }
        }
        else atr_index = ++index;

        // ---------------------------------- //
        
        // Find "Windows"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {

                this.windows = Boolean.parseBoolean(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // Find "Mac"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {

                this.mac = Boolean.parseBoolean(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // Find "Linux"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {

                this.linux = Boolean.parseBoolean(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // ---------------------------------- //
        
        // Find "Upvotes"
        int positives, negatives;

        while(true) {

            index++;

            if(line.charAt(index) == ',') {

                positives = Integer.parseInt(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        while(true) {

            index++;

            if(line.charAt(index) == ',') {

                negatives = Integer.parseInt(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        this.upvotes = (float)(positives * 100) / (float)(positives + negatives);

        // ---------------------------------- //
        
        // Find "AVG Playtime"
        while(true) {

            index++;

            if(line.charAt(index) == ',') {

                this.avg_playtime = Integer.parseInt(line.substring(atr_index, index));

                atr_index = ++index;
                break;
            }
        }

        // ---------------------------------- //
        
        // Find "Developers"
        if(line.charAt(atr_index) != ',') {

            if(line.charAt(atr_index) == '\"') {
                
                atr_index++;
                c_search = '\"';
            }
            else c_search = ',';
            
            while(true) {

                index++;

                if(line.charAt(index) == c_search) {
                    
                    this.developers = line.substring(atr_index, index);

                    atr_index = ++index;
                    break;
                }
            }
        }
        else atr_index = ++index;
       
        // ---------------------------------- //
        
        // Find "Genres"
        if(index < line.length() - 1) {

            if(line.charAt(index) == ',') atr_index = ++index;                    
            if(line.charAt(atr_index) == '\"') {

                atr_index++;
                
                while(true) {

                    index++;

                    if(line.charAt(index) == ',') {
                        
                        this.genres.add(line.substring(atr_index, index));

                        atr_index = ++index;
                    }
                    else if(line.charAt(index) == '\"') {

                        this.genres.add(line.substring(atr_index, line.length() - 1));
                        break;
                    }
                }
            }
            else this.genres.add(line.substring(atr_index, line.length()));
        }

        // -------------------------------------------------------------------------------- //
    }

    public void print() {

        String avg_pt = null;

        if(this.avg_playtime == 0) avg_pt = "null ";
        else if(this.avg_playtime < 60) avg_pt = this.avg_playtime + "m ";
        else {

            if(this.avg_playtime % 60 == 0) avg_pt = this.avg_playtime / 60 + "h ";
            else avg_pt = (this.avg_playtime / 60) + "h " + (this.avg_playtime % 60) + "m ";
        }

        DecimalFormat df = new DecimalFormat("##");

        System.out.println(this.app_id + " " + this.name + " " + default_dateFormat.format(this.release_date) + " " + this.owners + " " + this.age + " " + String.format(Locale.ENGLISH, "%.2f", this.price) + " " + this.dlcs + " " + this.languages + " " + this.website + " " + this.windows + " " + this.mac + " " + this.linux + " " + (Float.isNaN(this.upvotes) ? "0% " : df.format(this.upvotes) + "% ") + avg_pt + this.developers + " " + this.genres);
    }

    // ---------------------------------------------------------------------------------------------- //
}


//Alvinegra
class Node {

    public boolean color;
    public Game elemento;
    public Node left, right;

    public Node() { this(null); }
    public Node(Game elemento) { this(elemento, false, null, null); }
    public Node(Game elemento, boolean color) { this(elemento, color, null, null); }

    public Node(Game elemento, boolean color, Node left, Node right) {

        this.color = color;
        this.elemento = elemento;
        this.left = left;
        this.right = right;
    }
}

class Alvinegra {

	private Node root;
    public int c_compares;
    public long t_begin;

	public Alvinegra() {

        // Initialize bench log
        c_compares = 0;
        t_begin = System.currentTimeMillis();

        // Initialize root
        root = null;
    }

	public boolean search(String x) {

        System.out.print("raiz");
        return search(x, root); 
    }

	private boolean search(String x, Node i) {
        
        boolean resp;
		
        if(i == null) {

            c_compares++;
            resp = false;
        }
        else if(x.compareTo(i.elemento.getName()) == 0) {
    
            c_compares += 2;
            resp = true;
        }
        else if(x.compareTo(i.elemento.getName()) < 0) {
            
            System.out.print(" esq");

            c_compares += 3;
            resp = search(x, i.left);
        }
        else {
            
            System.out.print(" dir");

            c_compares += 3;
            resp = search(x, i.right);
        }
        return resp;
	}

    public void inserir(Game elemento) throws Exception {
        
        if(root == null) {
            
            c_compares++;
            root = new Node(elemento);
        }
        else if(root.left == null && root.right == null) {

            c_compares += 4;

            if(elemento.getName().compareTo(root.elemento.getName()) < 0) root.left = new Node(elemento);
            else root.right = new Node(elemento);
        }
        else if(root.left == null) {

            c_compares += 5;

            if(elemento.getName().compareTo(root.elemento.getName()) < 0) {
                
                c_compares++;
                root.left = new Node(elemento);
            }
            else if(elemento.getName().compareTo(root.right.elemento.getName()) < 0) {
              
                c_compares += 2;

                root.left = new Node(root.elemento);
                root.elemento = elemento;
            } 
            else {

                c_compares += 2;

                root.left = new Node(root.elemento);
                root.elemento = root.right.elemento;
                root.right.elemento = elemento;
            }
            
            root.left.color = root.right.color = false;
        } 
        else if(root.right == null) {

            c_compares += 8;

            if(elemento.getName().compareTo(root.elemento.getName()) > 0) {
                
                c_compares++;
                root.right = new Node(elemento);
            }
            else if(elemento.getName().compareTo(root.left.elemento.getName()) > 0) {
                
                c_compares += 2;

                root.right = new Node(root.elemento);
                root.elemento = elemento;
            } 
            else {

                c_compares += 2;

                root.right = new Node(root.elemento);
                root.elemento = root.left.elemento;
                root.left.elemento = elemento;
            }

            root.left.color = root.right.color = false;
        } 
        else insert(elemento, null, null, null, root);

        root.color = false;
    }

    private void insert(Game elemento, Node bisavo, Node avo, Node pai, Node i) throws Exception {
        
        if(i == null) {

            c_compares += 3;

            if(elemento.getName().compareTo(pai.elemento.getName()) < 0) i = pai.left = new Node(elemento, true);
            else i = pai.right = new Node(elemento, true);
        
            if(pai.color == true) balance(bisavo, avo, pai, i);
        } 
        else {
           
            c_compares += 5;

            if(i.left != null && i.right != null && i.left.color == true && i.right.color == true) {
              
                i.color = true;
                i.left.color = i.right.color = false;
              
                if(i == root) {
                    
                    c_compares++;
                    i.color = false;
                }
                else if(pai.color == true) {
                    
                    c_compares += 2;
                    balance(bisavo, avo, pai, i);
                }
            }
           
            if(elemento.getName().compareTo(i.elemento.getName()) < 0) {
                
                c_compares++;

                insert(elemento, avo, pai, i, i.left);
            }
            else if(elemento.getName().compareTo(i.elemento.getName()) > 0) {
                
                c_compares += 2;

                insert(elemento, avo, pai, i, i.right);
            }
            else {
                
                c_compares += 2;

                throw new Exception("Erro inserir (elementoo repetido)!");
            }
        }
    }

    private void balance(Node bisavo, Node avo, Node pai, Node i) {
        
        c_compares++;
           
        if(pai.color == true) {

            c_compares += 2;

            if(pai.elemento.getName().compareTo(avo.elemento.getName()) > 0) {
               
                if(i.elemento.getName().compareTo(pai.elemento.getName()) > 0) avo = rotateLeft(avo);
                else avo = rotateRightLeft(avo);
            } 
            else {

                if(i.elemento.getName().compareTo(pai.elemento.getName()) < 0) avo = rotateRight(avo);
                else avo = rotateLeftRight(avo);
            }
           
            if(bisavo == null) {
                
                c_compares++;
                root = avo;
            }
            else if(avo.elemento.getName().compareTo(bisavo.elemento.getName()) < 0) {
                
                c_compares += 2;
                bisavo.left = avo;
            }
            else {
                
                c_compares += 2;
                bisavo.right = avo;
            }

            avo.color = false;
            avo.left.color = avo.right.color = true;
        }
    }

    private Node rotateRight(Node node) {
        
        Node leftNode = node.left;
        Node leftRightNode = leftNode.right;
  
        leftNode.right = node;
        node.left = leftRightNode;
  
        return leftNode;
    }
  
    private Node rotateLeft(Node node) {

        Node rightNode = node.right;
        Node rightLeftNode = rightNode.left;
  
        rightNode.left = node;
        node.right = rightLeftNode;
        return rightNode;
    }
  
    private Node rotateRightLeft(Node node) {

        node.right = rotateRight(node.right);
        return rotateLeft(node);
    }
  
    private Node rotateLeftRight(Node node) {
        
        node.left = rotateLeft(node.left);
        return rotateRight(node);
     }
}


// MAIN
public class Principal{
    
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main(String[] args) throws Exception{

        ArrayList<Game> games = new ArrayList<Game>();
                
        // ------------------------------------------------------------------------------ //

        try {

            // Read CSV file
            String basefile = "/tmp/games.csv";

            FileInputStream fstream = new FileInputStream(basefile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            // ------------------------------------ //

            // Explode CSV file reading games
            String line;
  
            while((line = br.readLine()) != null) {

                Game game = new Game();

                game.read(line);
                games.add(game);
            }

            // Close CSV file
            fstream.close();
        }
        catch(IOException e) { e.printStackTrace(); }

        // ---------------------------------------------------------------------------------------------- //

        // Read .in file
        Scanner scr = new Scanner(System.in);
        String line = scr.nextLine();
        
        Alvinegra item = new Alvinegra();

        while(true) {

            if(isFim(line)) break;

            int app_id = Integer.parseInt(line);

            // Search game with .in id
            for(Game game : games) {
                
                if(game.getAppId() == app_id)
                    item.inserir(game);  
            }

            line = scr.nextLine();
        }

       

        int n = Integer.parseInt(scr.nextLine());
        //String auxL = new String();
        
        for (int i = 0; i < n; i++) {
           

            line = scr.nextLine();
            String r = line.substring(0, 1);
            String param;
            int app_id;
        
            if (r.equals("I")) {

                 app_id = Integer.parseInt(line.substring(2, line.length()));

                // Search game with .in id
                for(Game game : games) {
                    
                    if(game.getAppId() == app_id)
                    item.inserir(game);  
                }

              
            } 

            else if (r.equals("R")) {
                
                
            }
        }

             // Third part - Search
            line = scr.nextLine();
        while(true) {

                if(isFim(line)) break;
            
                // ------------------------------------ //
            
                System.out.println(line);
                System.out.print((item.search(line) ? " SIM" : " NAO") + "\n");

                // ------------------------------------ //
            
                 line = scr.nextLine();
        }

            
          

        

        // ---------------------------------------------------------------------------------------------- //

        scr.close();

        // ---------------------------------------------------------------------------------------------- //

    
    
    }

}