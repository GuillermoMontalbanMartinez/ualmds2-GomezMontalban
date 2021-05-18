import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaProductoSeleccionado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; border: #ccc solid 2px; border-radius : 20px; background : #efefef; padding-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); justify-content: flex-end;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; justify-content: center; align-items: center; width: 15%; height: 60%;">
  <img style="height: 100%; width: 100%; flex-grow: 0; flex-shrink: 1; margin-left: var(--lumo-space-xl);" id="imagen">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="justify-content: space-between; align-self: center; width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="height: 10%; width: 100%; align-items: stretch; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-wrap: wrap; justify-content: flex-start; flex-grow: 0; align-self: center; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-left: var(--lumo-space-xl); justify-content: flex-start;">
     <vaadin-text-field id="nombreText" style="align-self: flex-start; margin-top: var(--lumo-space-s);" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; flex-shrink: 0; flex-direction: column; justify-content: center; align-items: center; margin-right: var(--lumo-space-xl); height: 65%; margin-top: var(--lumo-space-s);">
   <vaadin-text-area id="descripcionText" style="align-self: stretch; flex-grow: 1; flex-shrink: 1;" readonly></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; align-items: stretch; padding-right: var(--lumo-space-xl); width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; justify-content: space-around;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-bottom: var(--lumo-space-xl);">
     <p style="flex-grow: 0; margin-left: var(--lumo-space-xl); align-self: center;">Precio: </p>
     <vaadin-text-field id="precioText" style="align-self: center;" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-bottom: var(--lumo-space-xl); align-self: center; height: 10%; width: 10%;">
     <p style="flex-grow: 0; width: 100%; align-self: center;">Cantidad: </p>
     <vaadin-text-field id="cantidadText" style="width: 50%; align-self: center; padding-right: var(--lumo-space-l);" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
    <vaadin-button theme="icon" aria-label="Add new" style="align-self: flex-start; margin-top: var(--lumo-space-s); margin-left: var(--lumo-space-xl);" id="sumarUnidadButton">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="restarUnidadButton" style="margin-top: var(--lumo-space-s);">
     <iron-icon icon="lumo:minus"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 5%; height: 15%; align-self: center; margin-bottom: var(--lumo-space-s); padding-right: var(--lumo-space-m);">
  <vaadin-button theme="icon" aria-label="Add new" id="quitarButton">
   <iron-icon icon="lumo:cross"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-producto-seleccionado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoSeleccionado.is, VistaProductoSeleccionado);
