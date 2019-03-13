package P08_MooD_3;

public interface GameObject<T> {
    String getUsername();
    String getCharacterType();
    Number getSpecialPoints();
    int getLevel();
    T getHashedPassword();
    void setHashedPassword(T password);
}
