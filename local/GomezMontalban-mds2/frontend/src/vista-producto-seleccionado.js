import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-producto-seleccionado`
 *
 * VistaProductoSeleccionado element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoSeleccionado extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
