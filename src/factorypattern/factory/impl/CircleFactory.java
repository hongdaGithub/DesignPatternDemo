package factorypattern.factory.impl;

import factorypattern.factory.ShapeAbstactFactory;
import factorypattern.product.Shape;
import factorypattern.product.impl.Circle;

/** 
 * @ClassName: CircleFactory 
 * @Description: 具体工厂:生产圆形
 * @author HongDa
 * @date 2018年9月13日 下午3:13:04 
 */
public class CircleFactory implements ShapeAbstactFactory {

	@Override
	public Shape getInstance() {
		return new Circle();
	}
}
