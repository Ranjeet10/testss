package com.envent.bottlesup.mvp.model.server_response.drink_item_response;

import com.envent.bottlesup.mvp.model.server_response.fooditems.FoodItems;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ronem on 7/17/18.
 */

public class SearchedDrinkItemResponse implements Serializable {

    @SerializedName("data")
    private List<DrinkItemsItem> data;

    @SerializedName("status")
    private String status;

    public List<DrinkItemsItem> getData() {
        return data;
    }

    public void setData(List<DrinkItemsItem> data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SearchedDrinkItemResponse{" +
                "data=" + data +
                ", status='" + status + '\'' +
                '}';
    }
}
