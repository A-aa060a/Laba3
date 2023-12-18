package com.bignerdranch.android.beatbox;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;
import android.widget.SeekBar;

import java.text.MessageFormat;

public class FragmentViewModel extends BaseObservable {

    public ObservableField<String> mPlaybackSpeedRate = new ObservableField<>("Скорость воспроизведения: 100 %");
    private BeatBox mBeatBox;

    public FragmentViewModel(BeatBox beatBox) {
        if (beatBox != null) {
            mBeatBox = beatBox;
        }
    }

    public void onPlaybackSpeedRateChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mPlaybackSpeedRate.set(MessageFormat.format("Скорость воспроизведения: {0} %", progress + 20));
        mBeatBox.setPlaybackSpeedRate((progress + 20.0f) / 100);
    }

}