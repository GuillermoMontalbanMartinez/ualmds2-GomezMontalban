import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productos-seleccionados.js';
import './vista-ver-publicidad.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaCarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<h3>Carrito</h3>
<vista-productos-seleccionados style="width: 100%; height: 60%;" id="vistaProductosSeleccionados"></vista-productos-seleccionados>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0; justify-content: flex-end; align-self: flex-start;">
  <p style="align-self: center; flex-grow: 0; margin-right: var(--lumo-space-xl);">Precio : </p>
  <vaadin-text-field id="textPrecio" style="align-self: center; width: 7%; margin-right: var(--lumo-space-xl);" readonly></vaadin-text-field>
  <vaadin-button theme="primary" style="align-self: center; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);" id="comprarButton">
    Comprar 
  </vaadin-button>
  <vaadin-button theme="primary" style="align-self: center; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);" id="cambiarDatosButton">
    Cambiar datos de pago 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
<vista-ver-publicidad style="height: 15%;"></vista-ver-publicidad>
`;
    }

    static get is() {
        return 'vista-carrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCarrito.is, VistaCarrito);
