package com.cmf.ec.performance.spi;

public interface PerformanceBizSpi {
	// 返回业务失败还是成功,由提供方决定
	public boolean execute();

}
