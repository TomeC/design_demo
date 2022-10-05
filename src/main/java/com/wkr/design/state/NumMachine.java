package com.wkr.design.state;

import static com.wkr.design.state.Event.*;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1911:00
 */
public class NumMachine {
    private Event currentEvent = EMPTY;
    private static final Event[][] translationTable = {
            {EMPTY, INT, EMPTY},
            {INT, INT, DECIMAL},
            {DECIMAL, DECIMAL, DECIMAL}
    };
    private static final boolean[][] eventState = {
            {true,true,false},
            {false,true,true},
            {false,true,false},
    };
    public boolean convert(int code) {
        boolean next = eventState[currentEvent.getCode()][code];
        if (next) {
            currentEvent = translationTable[currentEvent.getCode()][code];
            System.out.println(currentEvent);
        }
        return next;
    }
    public boolean check(String number) {
        for (char c : number.toCharArray()) {
            int code = 0;
            if (c == '.') {
                code = 2;
            } else {
                code = 1;
            }
            if (!convert(code)) {
                return false;
            }
        }
        return true;
    }
}
