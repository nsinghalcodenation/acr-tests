class MagicNumbersStrings{

//    Violation
    public void accelerate() {
        if (speed == 10 && setting.equals("fast")) {  }
    }

// Violation
    public void decelerate() {
        if (speed == 100 && setting.equals("slow")) {  }
    }

    private static final int SPEED_10_KM_PER_HOUR = 10;
    private static final int SPEED_100_KM_PER_HOUR = 100;
    private static final String SPEED_SETTING_FAST = "fast";
    private static final String SPEED_SETTING_SLOW = "slow";

    public void accelerate() {
        if (speed == SPEED_10_KM_PER_HOUR && SPEED_SETTING_FAST.equals(setting)) {  }
    }

    public void decelerate() {
        if (speed == SPEED_100_KM_PER_HOUR && SPEED_SETTING_SLOW.equals(setting)) {


        }
        // VIolation
        if (clientRequestStatus == 404) {  }

    }

    private static final String REPORT_RUN_ERROR = "Report run failed";
    private static final String CAUSED_BY = "caused.by";
    private static final int PERMITS = 1;

    logger.error("I was not able to remove tempfile: " + tempFile.getAbsolutePath() + "//" + tempFile.getName(),
    e);



}

