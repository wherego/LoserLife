package com.example.y.mvp.mvp.model;

/**
 * by y on 2016/5/27.
 */
public interface BaseModel<T> {


    void netWork(T model);

    interface TabNewsModel extends BaseModel<BaseDataBridge.TabNewsData> {
    }

    interface TabNameModel extends BaseModel<BaseDataBridge.TabNameData> {
    }

    interface NewsListModel {
        void netWorkNewList(int id, int page, BaseDataBridge.NewsListData newsListData);
    }

    interface NewsDetailModel {
        void netWorkNewsDetail(int id, BaseDataBridge.NewsDetailData newsDetailData);
        void netWorkNewsMessageWithImage(String message, BaseDataBridge.NewsDetailData newsDetailData);
    }

    interface ImageNewModel {
        void netWorkNew(int id, int rows, BaseDataBridge.ImageNewData imageNewData);
    }

    interface ImageListModel {
        void netWorkList(int id, int page, BaseDataBridge.ImageListData imageListData);
    }

    interface ImageDetailModel {
        void netWorkDetail(int id, BaseDataBridge.ImageDetailData imageDetailData);
    }

    interface JokeTextListModel {
        void netWorkJoke(int page, BaseDataBridge.JokeTextList jokeList);
    }

    interface JokePicListModel {
        void netWorkJoke(int page, BaseDataBridge.JokePicList jokeList);
    }

    interface VideoListModel {
        void netWorkJoke(int page, String keyword, BaseDataBridge.VideoList videoList);
    }
}
