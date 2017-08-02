package com.example.magaz.draganddraw.models;

import android.graphics.PointF;

import com.google.common.base.Objects;

/**
 * @author Markin Andrey on 02.08.2017.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin, PointF current) {
        mOrigin = origin;
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public void setOrigin(PointF origin) {
        mOrigin = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equal(mOrigin, box.mOrigin) &&
                Objects.equal(mCurrent, box.mCurrent);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mOrigin, mCurrent);
    }

    @Override
    public String toString() {
        return "Box{" +
                "mOrigin=" + mOrigin +
                ", mCurrent=" + mCurrent +
                '}';
    }
}
