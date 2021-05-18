import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaDarBajaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="VaadinVerticalLayoutDarBajaProducto">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <h1 style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">Eliminar producto</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;font-weight: bold;">Nombre del producto</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;" id="textNombreProductoEliminarProducto"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button theme="primary error" id="ButtonCancelar">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button theme="primary" id="ButtonAceptar">
      Aceptar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-baja-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarBajaProducto.is, VistaDarBajaProducto);
