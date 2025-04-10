package java.api.Java_API.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name="avaible_limit",scale = 13, precision = 2)
    private BigDecimal limit;

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public BigDecimal getLimit() { return limit; }

    public void setLimit(BigDecimal limit) { this.limit = limit; }
}
