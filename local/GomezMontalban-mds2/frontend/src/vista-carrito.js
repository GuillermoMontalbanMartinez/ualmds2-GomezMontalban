import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-banner-registrado.js';
import './vista-productos-seleccionados.js';
import './vista-ver-publicidad.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout>
 <vista-banner-registrado style="width: 100%;"></vista-banner-registrado>
</vaadin-vertical-layout>
<h3>Carrito</h3>
<vista-productos-seleccionados style="width: 100%; height: 60%;"></vista-productos-seleccionados>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0; justify-content: flex-end; align-self: flex-start;">
  <p style="align-self: center; flex-grow: 0; margin-right: var(--lumo-space-xl);">Precio : </p>
  <vaadin-button theme="primary" style="align-self: center; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);">
   Comprar
  </vaadin-button>
  <vaadin-button theme="primary" style="align-self: center; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);">
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
