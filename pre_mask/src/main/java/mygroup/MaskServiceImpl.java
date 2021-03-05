package mygroup;

import com.sun.tools.javac.util.StringUtils;

public class MaskServiceImpl implements MaskService {
    @Override
    public String algorithm() {
       return "pre";
    }

    @Override
    public String maskValue(String inputValue, Integer nonMaskedLength) {
        if (StringUtils.isBlank(inputValue))
    }
}
