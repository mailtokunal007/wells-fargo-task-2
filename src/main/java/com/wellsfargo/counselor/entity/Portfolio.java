package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column(nullable = false)
    private long ClientId;


    @Column(nullable = false)
    private Date creationDate;
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public Portfolio() {

    }
    // Other properties

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClientId() {
        return client;
    }

    public void setClientId(Client client) {
        this.client = client;
    }


    public Portfolio(Date creationDate) {
        this.creationDate = creationDate;
    }
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    // Constructors, getters, and setters
}
