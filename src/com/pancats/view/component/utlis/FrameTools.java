package com.pancats.view.component.utlis;
/**
 * 当前窗体控制工具
 * @author 小疯子
 *
 */
public interface FrameTools {
	
	/**
	 * 关闭当前窗体
	 */
	void frameClose();
	/**
	 * 最小化当前窗体(缩放到任务栏上)
	 */
	void frameMinimality();
	
	/**
	 * 最大化当前窗体
	 */
	void frameMaximization();
	
	/**
	 * 还原最大化之前的当前窗体的大小
	 */
	void frameRestore();
}
