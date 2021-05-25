import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaProductoMasVendido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; border: #ccc solid 2px; border-radius : 5px;">
 <vaadin-vertical-layout theme="spacing" style="align-self: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin: var(--lumo-space-m);">Producto:</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field id="textNombre" style="align-self: center;" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); height: 50%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="width: 30%;">
    <img id="imagen" style="width: 50%; height: 50%; margin: var(--lumo-space-m);">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 70%; height: 40%;">
    <vaadin-text-area id="textDescripcion" style="width: 70%;" readonly></vaadin-text-area>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">Precio :</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field id="textPrecio" style="align-self: center; margin: var(--lumo-space-m);" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button theme="icon" aria-label="Add new" id="anadirAlCarrito" style="align-self: center; margin-right: var(--lumo-space-xl);">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="primary" id="verCaracteristicas" style="align-self: center; flex-grow: 1; margin-left: var(--lumo-space-xl);">
     VerCaracteristicas
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto-mas-vendido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoMasVendido.is, VistaProductoMasVendido);
