package br.com.soc.view;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import br.com.soc.bean.BaseEntity;
import br.com.soc.bean.Empresa;

public class SimpleEntityConverter implements Converter {


	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
	 * TODO implementar chamada a banco de dados
	 */
	public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
		if (value != null) {
			Empresa empresa = new Empresa(value, "Empresa convertida");
			return empresa;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 * TODO implementar chamada ao banco
	 */
	public String getAsString(FacesContext ctx, UIComponent component, Object value) {
		if (value != null) {
			return ((Empresa) value).getId();
		}
		return null;
	}

}
