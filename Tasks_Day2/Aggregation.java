package Tasks_Day2;
class Author{
    String authorName;
    int age;
    String place;
    Author(String name,int age,String place)
    {
        authorName=name;
        this.age=age;
        this.place=place;
    }
    
}
class Book{
    String bookName;
    int price;
    Author author;   // aggregation
    Book(String name,int price,Author author)
    {   
        bookName=name;
        this.price=price;
        this.author=author;
    }
}
public class Aggregation
{
     public static void main(String[] args) 
     {
        Author author=new Author("J.K Rowling",55,"New York City");
        Book b=new Book("Harry Potter and the Chamber of Secrets",250,author);

        System.out.println("Book name : "+b.bookName);
        System.out.println("Book Price : "+b.price);

        System.out.println("Author : "+b.author.authorName);
        System.out.println("Author Age: "+b.author.age);
        System.out.println("Author place : "+b.author.place);
    }
    
}
