package com.xyoye.dandanplay.mvp.presenter;

import com.xyoye.dandanplay.utils.interf.presenter.BaseMvpPresenter;

/**
 * Created by YE on 2018/6/29 0029.
 */


public interface PlayFragmentPresenter extends BaseMvpPresenter {
    void listFolder(String path);

    void getVideoList();

    void deleteFolder(String folderPath);
}
