import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaModificarDatosDeCompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center;">
 <h2>Datos de pago</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%; justify-content: flex-start;">
  <h4 style="flex-grow: 1;">Número de tarjeta</h4>
  <vaadin-text-field style="align-self: center;" id="textNumeroTarjeta"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%; justify-content: flex-start;">
  <h4 style="width: 60%;">Titular</h4>
  <vaadin-text-field style="align-self: center;" id="textTitularTarjeta"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%; justify-content: flex-start;">
  <h4 style="width: 60%;">Fecha de caducidad</h4>
  <vaadin-date-picker id="textFechaCaducidad" style="flex-shrink: 1; align-self: center;"></vaadin-date-picker>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%; justify-content: flex-start;">
  <h4 style="width: 60%;">CVV </h4>
  <vaadin-text-field style="align-self: center;" id="textCVVTarjeta"></vaadin-text-field>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-modificar-datos-de-compra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificarDatosDeCompra.is, VistaModificarDatosDeCompra);
