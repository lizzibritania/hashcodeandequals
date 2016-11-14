/**
 * Created by Lizzi on 14.10.2016.
 */
import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if ((this.name==book.name)&&(this.authors.equals(book.authors)==true)&&(this.price== book.price)&&(this.qty==book.qty))
            return true;
        else return false;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(authors);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + qty;
        return result;
    }

    public static class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public Author() {

        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {

            if (!(o instanceof Author)) return false;

            Author author = (Author) o;

            if ((this.name==author.name)&&(this.email==author.email)&&(this.gender==author.gender))
                return true;
            else return false;

        }

        @Override
        public int hashCode() {
            int result = getName().hashCode();
            result = 31 * result + getEmail().hashCode();
            result = 31 * result + (int) getGender();
            return result;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    Book(String n, Author[] a, double p) {
        name = n;
        this.authors = a;
        price = p;
    }

    Book(String n, Author[] b, int q) {
        name = n;
        authors = b;
        qty = q;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    String getAuthorNames() {
        return Arrays.toString(authors);
    }
}