package mygroup;

public interface MaskService {
    String algorithm();
    String maskValue(String inputValue, Integer nonMaskedLength);
}
