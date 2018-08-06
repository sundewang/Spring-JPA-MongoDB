package xyz.sun.springjpamongodb.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sundewang
 * @date 2018/7/25
 */
@Document(collection = "t_partner_fill_num_id")
public class Partner {
    @Id
    private ObjectId id;
    private int companyNumId;
    private int stockNumId;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getCompanyNumId() {
        return companyNumId;
    }

    public void setCompanyNumId(int companyNumId) {
        this.companyNumId = companyNumId;
    }

    public int getStockNumId() {
        return stockNumId;
    }

    public void setStockNumId(int stockNumId) {
        this.stockNumId = stockNumId;
    }
}
