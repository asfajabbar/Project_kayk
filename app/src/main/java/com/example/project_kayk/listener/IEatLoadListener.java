package com.example.project_kayk.listener;

import com.example.project_kayk.model.CakeModel;

import java.util.List;

public interface IEatLoadListener {
    void onEatLoadSuccess(List<CakeModel> cakeModelList);
    void onEatLoadFailed(String message);
}
