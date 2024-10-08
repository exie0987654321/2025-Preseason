package frc.robot;

import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;

public class CommandFactory {
    private final Intake intake;
    private final Indexer indexer;

    public CommandFactory(Intake intake, Indexer indexer) {
        this.intake = intake;
        this.indexer = indexer;
    }
}
