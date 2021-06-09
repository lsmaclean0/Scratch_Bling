package model;

import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "scratchers")
public class scratchers {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public Text description;

    private enum Sizes {
        Sizes("XL", "L", "M", "S");
        @Column(name = "size")
        private String size;
        private Sizes(String... size) {
            this.size = Arrays.toString(size);
        }
    }

    @Column(name = "price")
    public Double price;

    public scratchers() {
        super();
    }

    public scratchers(String name, Text description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

}
