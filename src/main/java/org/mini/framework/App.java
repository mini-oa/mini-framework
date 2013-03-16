/**
 * 
 */
package org.mini.framework;

import java.util.List;

import org.mini.framework.bean.ColumnParameter;
import org.mini.framework.bean.FieldColumn;
import org.mini.framework.bean.Operate;
import org.mini.framework.cache.ColumnParametersCache;
import org.mini.framework.cache.ColumnParametersCacheImpl;

/**
 * @author Administrator
 * 
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ResourceLoader resourceLoader = new DefaultResourceLoader(); Resource
		 * resource = resourceLoader.getResource("classpath:test.xml");
		 * 
		 * if(!resource.exists()) { System.out.println("文件不存在"); return; }
		 * 
		 * JAXBContext context; InputStream is = null; try { context =
		 * JAXBContext.newInstance(ColumnParameters.class);
		 * 
		 * is = resource.getInputStream();
		 * 
		 * ColumnParameters value =
		 * (ColumnParameters)context.createUnmarshaller().unmarshal(is);
		 * 
		 * if(value != null && value.getParameters() != null) {
		 * for(ColumnParameter p : value.getParameters()) {
		 * System.out.println(p.getClassId()); if(p.getFieldColumn() != null) {
		 * for(FieldColumn f:p.getFieldColumn()) {
		 * System.out.println(f.getColumnName());
		 * System.out.println(f.getFieldName());
		 * System.out.println(f.getParameterName()); } } } } } catch
		 * (JAXBException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } catch (Exception e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } finally { if(is !=
		 * null) { try { is.close(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } is = null; } }
		 */

		ColumnParametersCache cache = new ColumnParametersCacheImpl("test.xml");
		List<ColumnParameter> values = cache.getParameters();

		if (values != null) {
			for (ColumnParameter p : values) {
				System.out.println(p.getClassId());
				if(p.getOperates() != null) {
					for (Operate o : p.getOperates()) {
						System.out.println(o.getOperateId());
						if (o.getFieldColumn() != null) {
							for (FieldColumn f : o.getFieldColumn()) {
								System.out.println(f.getColumnName());
								System.out.println(f.getFieldName());
								System.out.println(f.getParameterName());
							}
						}
					}
				}
				
			}
		}

		try {
			Thread.sleep(20 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		values = cache.getParameters();

		if (values != null) {
			for (ColumnParameter p : values) {
				System.out.println(p.getClassId());
				if(p.getOperates() != null) {
					for (Operate o : p.getOperates()) {
						System.out.println(o.getOperateId());
						if (o.getFieldColumn() != null) {
							for (FieldColumn f : o.getFieldColumn()) {
								System.out.println(f.getColumnName());
								System.out.println(f.getFieldName());
								System.out.println(f.getParameterName());
							}
						}
					}
				}
				
			}
		}
	}

}
