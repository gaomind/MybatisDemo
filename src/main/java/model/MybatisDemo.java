package model;

import java.io.Serializable;

/**
 * @author 
 */
public class MybatisDemo implements Serializable {
    private Integer id;

    private String mName;

    private Integer mAge;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Integer getmAge() {
        return mAge;
    }

    public void setmAge(Integer mAge) {
        this.mAge = mAge;
    }



    @Override
    public String toString() {
        return "MybatisDemo{" +
                "id=" + id +
                ", mName='" + mName + '\'' +
                ", mAge=" + mAge +
                '}';
    }
}