import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaAdministrarProductos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayoutAdministrarProductos">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%;">
  <h1>Administrar productos</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; align-self: center; flex-shrink: 0; justify-content: center; width: 100%;">
  <vaadin-button style="align-self: center; flex-shrink: 0;" theme="primary" id="vaadinButtonAnadirProductos">
    Añadir productos 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; align-self: center; flex-shrink: 0; width: 100%;">
  <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary" id="vaadinButtonEliminarProducto">
    Eliminar producto 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrar-productos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarProductos.is, VistaAdministrarProductos);
