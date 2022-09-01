package com.ibtech.task.batch;

public interface IXBatchService {
	String execute(int thread, int commitCount);

}
