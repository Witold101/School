package school.lesson4.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTimeTest {

    @Test
    void ret() {
        PartTime partTime = new PartTime(922);
        int hour = partTime.ret()[2];
        int minute = partTime.ret()[1];
        int second = partTime.ret()[0];

        assertEquals(hour,0);
        assertEquals(minute,15);
        assertEquals(second,22);

    }
}