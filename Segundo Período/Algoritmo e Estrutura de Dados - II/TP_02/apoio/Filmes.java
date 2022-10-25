import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.charset.*;
import java.text.ParseException;



class Filmes {
    /*String), T´ıtulo Original (String), Data de Lan¸camento (Date), Dura¸c˜ao (int), Genero (String),
Idioma original (String), Situa¸c˜ao (String), Or¸camento (Float) 2
, Palavras-Chave (Vetor de
Strings). */

    private String nome;
    private String original;
    private Date data;
    private String genero;
    private String idioma;
    private String situacao;
    private ArrayList<String> chave;
    private float orcamento;
    private int duracao;
    SimpleDateFormat junior = new SimpleDateFormat("dd/MM/yyyy");
    
    //construtor - setando valores 
    public Filmes() {
        nome = "";
        original = "";
        data = null;
        duracao = 0;
        genero = "";
        idioma = "";
        situacao = "";
        orcamento =  (float) 0.0;
        chave = new ArrayList<String>(); 
    }
    
    //construtor this - segundo
    public Filmes(String nome, String original, Date data, int duracao, String genero, String idioma, String situacao, float orcamento, ArrayList<String> chave ) {
        this.nome = nome;    
        this.original = original;
        this.data = data;
        this.duracao = duracao;
        this.genero = genero;
        this.idioma = idioma;
        this.situacao = situacao;
        this.orcamento = orcamento;
        this.chave = chave;
    }

    //---------------------------------------------------------------------------------------------
    //set 
    public void setNome (String nome) {
        this.nome = nome; 
    } 
    
    public void setOriginal (String original) {
        this.original = original;
    }

    public void setData (Date data) {
        this.data = data;
    }

    public void setDuracao (int duracao) {
        this.duracao = duracao;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public void setIdioma (String idioma) {
        this.idioma = idioma;
    }

    
    public void setSituacao (String situacao) {
        this.situacao = situacao;
    }
    
    public void setOrcamento (float orcamento) {
        this.orcamento = orcamento;
    }

    
    public void setChave (ArrayList<String> chave) {
        this.chave = chave;
    }
    
    //---------------------------------------------------------------------------------------------
    //get 
    public String getNome() {
        return this.nome;
    }

    public String getOriginal () {
        return this.original;
    }

    public Date getData () {
        return this.data;
    }

    public int getDuracao () {
        return this.duracao;
    }

    public String getGenero () {
        return this.genero;
    }

    public String getIdioma () {
        return this.idioma;
    }

    public String getSituacao () {
        return this.situacao;
    }

    public float getOrcamento() {
        return this.orcamento;
    }

    
    public ArrayList<String> getChave () {
        return this.chave;
    } 
    //---------------------------------------------------------------------------------------------

    //clonar ??
    public Filmes clone() {
        Filmes resp = new Filmes();
        resp.nome = this.nome;
        resp.original = this.original;
        resp.data = this.data;
        resp.genero = this.genero;
        resp.idioma = this.idioma;
        resp.orcamento = this.orcamento;
        resp.chave = this.chave;
        return resp;
    }

    //---------------------------------------------------------------------------------------------
 /*String), T´ıtulo Original (String), Data de Lan¸camento (Date), Dura¸c˜ao (int), Genero (String),
Idioma original (String), Situa¸c˜ao (String), Or¸camento (Float) 2
, Palavras-Chave (Vetor de
Strings). */
    public void printClass() {
        MyIO.println(this.nome + " " + this.original + " " + junior.format(this.data) + " " + this.duracao  + " " + this.genero + " " + 
        this.idioma + " " + this.situacao + " " + this.orcamento + " " + this.chave);
    }

    //---------------------------------------------------------------------------------------------

    public String removeTags(String linha) {
        String resp = "";
        int i = 0;
        while ( i < linha.length()) { //se menor que a linha, ou seja ate chegar no zero
            if (linha.charAt(i) == '<') { //onde começa contar
                i++;
                while (linha.charAt(i) != '>') {
                    i++;
                } //fim while 1 == conta ate chegar <>
            } //fim if <
         else if(linha.charAt(i) == '&'){ //mesma coisa 
            i++;
            while(linha.charAt(i) != ';') i++;
        } else { //o que estiver fora das tags é concatenado a String resp a ser retornada
            resp += linha.charAt(i);
        }
            i++;
        } //fim while
            return resp;
    } //fim removetags  
    
    //---------------------------------------------------------------------------------------------


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

    //---------------------------------------------------------------------------------------------


    
    public int justInt(String busca){
        String resp = "";
        for(int i = 0; i < busca.length(); i++){
            if(busca.charAt(i) >= '0' && busca.charAt(i) <= '9'){ //caso o caracter seja um número ele é concatenado a variável resp
                resp += busca.charAt(i);
            } else { //caso seja outro caracter, o i recebe o valor da condição de parada e o método de repetição é encerrado
                i = busca.length();
            }
        }
        return Integer.parseInt(resp); //conversão da string resp para número inteiro a ser retornado
    }
    

    //---------------------------------------------------------------------------------------------

    public void PalavraChave(String file) {
        String buscaAux2 = "";
        this.chave = new ArrayList<String>();

        try {
            FileReader entrada = new FileReader(file); //abrir o arquivo
            BufferedReader br = new BufferedReader(entrada); //leitor do arquivo ate a parte que quero

            buscaAux2 = br.readLine();
            while(!buscaAux2.contains("<section class=\"keywords right_column\">"))
                buscaAux2 = br.readLine();

            buscaAux2 = br.readLine();
            while (!buscaAux2.contains("</ul>")) {
                buscaAux2 = br.readLine();
                if (buscaAux2.contains("/keyword/")) {
                    buscaAux2 = removeTags(buscaAux2) ;
                    buscaAux2 = buscaAux2.trim();
                    this.chave.add(buscaAux2);
                }
            }


            br.close();
        } //fim try 
        catch (IOException e) {
        e.printStackTrace();
    } //fim catch
    } //fim PalavraChave

    //---------------------------------------------------------------------------------------------

    public void Duracao(String file) {
        
        String buscaAux3 = "";
        String total = "";

        try {
            FileReader entrada = new FileReader(file); //abrir o arquivo
            BufferedReader br = new BufferedReader(entrada); //leitor do arquivo ate a parte que quero

            buscaAux3 = br.readLine(); 
            while (!buscaAux3.contains("<span class=\"runtime\"")) 
                buscaAux3 = br.readLine();
            
            buscaAux3 = br.readLine();
            buscaAux3 = br.readLine().trim();
            total = removeTags(buscaAux3);


            if (total.length() > 3) {
                String h = total.substring(0,1); //ate onde vai 0 e 1 (duas primeiras casas)
                int hora = Integer.parseInt(h);
                int min = justInt(total.substring(3,5));

                this.duracao = (hora*60) + min;
            } 
            else {
                int min = justInt(total.substring(0,2));

                this.duracao = min;
            }
            
            br.close();
        }
        catch (IOException e) {
        e.printStackTrace();
    } //fim catch
    } //fim PalavraChave

    //---------------------------------------------------------------------------------------------
    
    public void Orcamento (String file) {
        float orca = 0;
        String buscaAux4 = "";
        String f =  "";


        try {
            FileReader entrada = new FileReader(file); //abrir o arquivo
            BufferedReader br = new BufferedReader(entrada); //leitor do arquivo ate a parte que quero

            buscaAux4 = br.readLine(); 
            while (!buscaAux4.contains("Orçamento")) 
                buscaAux4 = br.readLine();
            
            //buscaAux4 = br.readLine().trim();
            f = removeTags(buscaAux4);

            if (f.contains("-")) {
                setOrcamento(0);
            } else {
                f = f.substring(13);
                f = f.replace(",", "");
                f = f.replace("$", "");
                orca = Float.parseFloat(f);
                setOrcamento(orca);
            }

           
            
            br.close();
        }
        catch (IOException e) { 
        e.printStackTrace();
    } //fim catch
    } //fim PalavraChave
    

    //---------------------------------------------------------------------------------------------
    
    public String date(String file) {
        
        String buscaAux3 = "";
        String total = "";

        try {
            FileReader entrada = new FileReader(file); //abrir o arquivo
            BufferedReader br = new BufferedReader(entrada); //leitor do arquivo ate a parte que quero

            buscaAux3 = br.readLine(); 
            while (!buscaAux3.contains("<span class=\"release\"")) 
                buscaAux3 = br.readLine();
            
            buscaAux3 = br.readLine().trim();
            total = removeTags(buscaAux3);   
            
            br.close();
        }
        catch (IOException e) {
        e.printStackTrace();
    } //fim catch
    return total;
}
   
    public void parseDate(String file) throws ParseException {
        String tot2 = "";
        tot2 = date(file);
        tot2 = tot2.substring(0,10);

        Date tot = new SimpleDateFormat("dd/MM/yyyy").parse(tot2);
        setData(tot);

    }

    public void readTitulo (String file) {

       //String aux4 = "" ;
        String tituloO = null;

        try {
            FileReader entrada = new FileReader(file); //abrir o arquivo
            BufferedReader br = new BufferedReader(entrada); //leitor do arquivo ate a parte que quero

            String aux4 = "" ;
            aux4 = br.readLine();
            while ( aux4 != null ) {
                
                if(aux4.contains("Título original")) {
                   
                    tituloO = removeTags(aux4.replace("Título original", "").trim());
                    break;
                }
                
                aux4 = br.readLine();
            }

            if (tituloO == null) {
                this.original = nome;
            } else {
                this.original = tituloO.substring(1);
                
            }
        }catch (IOException e) {
            e.printStackTrace();
        } //fim catch


    }
    
    //ler arquivo e tratar
    public void ler(String fileName) throws ParseException {
        
        String file = "/tmp/filmes/" + fileName;
        String busca = "";
        

            //set nome - OK
            busca = "<title>"; //atribuindo a variavel busca
            String aux; // criando um aux
            aux = searchString(file, busca); //mnadando pra search e tratando com o remove tags
            this.nome = aux.substring(4, aux.indexOf(" (")).trim(); // atribuindo o valor total da aux, tirando ate chegar nos parenteses e cortando espaços
    
        
            //set original - OK
            readTitulo(file); // chamando função
           

            //set genero - OK
            busca = "/genre/"; //procurando e atribuindo
            this.genero = searchString(file, busca).trim(); //setando e cortando 
         
            //set idioma - OK 
            busca = "Idioma original"; //procurando e atribuindo
            this.idioma = searchString(file, busca).replace("Idioma original", "").trim();;  //setando nas this, tratando na search e colocando onde aparece idioma original na linha um espaço dps cortando 
    
            //set situação - OK
            busca = "<bdi>Situação";
            this.situacao = searchString(file, busca).replace("Situação", "").trim();

            //set orçamento - OK
            Orcamento(file);

            //set duracao - OK
            Duracao(file);
            
             
            //set chaves - OK
            PalavraChave(file);

            //set data - OK
            parseDate(file);
    

    }

   
    public static void main(String[] args) throws ParseException {

        MyIO.setCharset("UTF-8");
        
        Filmes teste = new Filmes(); //criando uma nova classe
        String nomeArquivo = MyIO.readLine(); //lendo o nome do arquivo
        
        teste.ler(nomeArquivo); //fazendo a variavel chamar a função ler de acordo com o nome do arquivo que leu


        while (!nomeArquivo.equals("FIM")) { //quando difrente de fim ele roda
            teste.printClass(); //printa a classe de printar
            nomeArquivo = MyIO.readLine(); // le dnv 
            if (nomeArquivo.equals("FIM")) { //se for fim ele para
                break; 
            }
            teste.ler(nomeArquivo); //le dnv e manda pra funç de leitura para tratar etc
            
        }
       
        
    }

} // fim class filme
