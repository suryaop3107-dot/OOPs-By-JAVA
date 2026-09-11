public class book {
    private String Title;
    private String author;
    private double price;
    private String Isbn;




    static int bookcount=0;
    final static String libraryName = "Sunrise Public Libraray";

    book(String Title,String author,double price , String Isbn){
        this.Title = Title;
        this.author = author;
        this.price = price;
        this.Isbn = Isbn;
        bookcount++;
    }

    public String gettitle(){
        return Title;
    }
    public String getauthor(){
        return author;
    }
    public double getprice(){
        return price;
    }
    public String getIsbn(){
        return Isbn;
    }

    public void SetTitle(String Title){
        this.Title=Title;
    }

    public void Setauthor(String author){
        this.author = author;
    }

    public void Setprice(double price){
        this.price = price;
    }

    public void SetIsbn(String Isbn){
        this.Isbn=Isbn;
    }

}
