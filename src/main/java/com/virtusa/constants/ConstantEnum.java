package com.virtusa.constants;

import com.virtusa.constants.EnumWebTemplate;

/**
 * Account Status
 */
public enum ConstantEnum implements EnumWebTemplate {
    //    BLACKLIST("Blacklist"), KES_POLIS("Kes Polis"), KES_SOC("Kes SOC"), KIV("KIV"), BERHENTI_PAS_SERAH("Berhenti (Pas Serah)"),
//    BERHENTI_PAS_TIDAK_SERAH("Berhenti (Pas Tidak Serah)"), OK("OK"), DITAHAN("Ditahan"), SEKATAN("Sekatan"), HILANG("Hilang");
    ZERO("zero");
    // Text to be display in the UI
    private String text;

    ConstantEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
