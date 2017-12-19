/**
 * Created by ${MIND-ZR} on 2017/12/18.
 */
public class User {
    private int id;
    private String m_name;
    private  int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", m_name='" + m_name + '\'' +
                ", age=" + age +
                '}';
    }
}
