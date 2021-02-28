import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos-comprados-recientemente`
 *
 * VistaProductosCompradosRecientemente element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosCompradosRecientemente extends PolymerElement {

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
        return 'vista-productos-comprados-recientemente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosCompradosRecientemente.is, VistaProductosCompradosRecientemente);
