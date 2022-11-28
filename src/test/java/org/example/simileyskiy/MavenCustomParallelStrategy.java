package org.example.simileyskiy;

import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

import java.util.concurrent.ForkJoinPool;
import java.util.function.Predicate;

public class MavenCustomParallelStrategy implements ParallelExecutionConfiguration, ParallelExecutionConfigurationStrategy {

    //��������� �������� ���������� Threads
    //Set custom Threads
    private static final int FIXED_PARALLELISM = 4;

    @Override
    public ParallelExecutionConfiguration createConfiguration(final ConfigurationParameters configurationParameters) {
        return this;
    }

    @Override
    public Predicate<? super ForkJoinPool> getSaturatePredicate() {
        return (ForkJoinPool p) -> true;
    }

    @Override
    public int getParallelism() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getMinimumRunnable() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getMaxPoolSize() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getCorePoolSize() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getKeepAliveSeconds() {
        return 30;
    }
}