package com.smc.properties;

import com.google.common.base.Splitter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkersConfigurationParser {

    public String getWorkersConfigurationProperties() {
        return workersConfigurationProperties;
    }

    @Value("${workers-configuration-properties}") private String workersConfigurationProperties;

    public List<WorkerConfiguration> getWorkerConfigurations() {
        List<String> workersConfigAsStrings = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(getWorkersConfigurationProperties());

        List<WorkerConfiguration> workerConfigs = new ArrayList<>();
        workersConfigAsStrings.stream().forEach(eachWorkerConfigString -> workerConfigs.add(WorkerConfiguration.newWorkerConfiguration(eachWorkerConfigString)));

        return workerConfigs;
    }

    public void parsePropertiesAndPrint() {
        List<WorkerConfiguration> workerConfigs = getWorkerConfigurations();
        for (WorkerConfiguration workerConfig : workerConfigs) {
            System.out.println(workerConfig.toString());
        }
    }

}

class WorkerConfiguration {

    private WorkerType workerType;

    private Stage workerStartPhase;

    public WorkerConfiguration(WorkerType workerType, Stage stage) {
        this.workerType =  workerType;
        this.workerStartPhase = stage;
    }

    public static WorkerConfiguration newWorkerConfiguration(String workerConfigurationAsString) {
        List<String> tokens = Splitter.on(".").omitEmptyStrings().trimResults().splitToList(workerConfigurationAsString);

        try {
            WorkerType type = WorkerType.valueOf(tokens.get(0));
            Stage stage = Stage.valueOf(tokens.get(1));
            return new WorkerConfiguration(type, stage);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid WorkerConfiguration Supplied", e);
        }
    }

    @Override
    public String toString() {
        return workerType + "-"  + workerStartPhase;
    }
}

enum WorkerType {

    TYPE1,
    TYPE2,
    TYPE3;
}

enum Stage {

    STAGE1,
    STAGE2,
    STAGE3;
}